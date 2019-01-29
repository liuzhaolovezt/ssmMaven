package com.ssm.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.TUserMapper;
import com.ssm.model.TUser;

@Service("infoService")
public class InfoServiceImpl extends HttpServlet implements IInfoService {
	private static Logger LOGER= Logger.getLogger(InfoServiceImpl.class);
	
	@Autowired
	private TUserMapper tUserMapper;
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException{
		doPost(req,resp);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		System.out.print("连接成功！");
		//从request获取流信息
		InputStream fileSource = req.getInputStream();
		//创建临时文件
		String FileTempName = "C:/tempFile";
		
		File tempFile = new File(FileTempName);
		
		FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
		
		byte b[] = new byte[1024];
		
		int n;
		while((n = fileSource.read(b))!=-1){
			fileOutputStream.write(b, 0, n);
		}
		
		fileOutputStream.close();
		fileSource.close();
		
		RandomAccessFile randomFile = new RandomAccessFile(tempFile, "r");
		randomFile.readLine();
		//读取文件名字位置
		String str = randomFile.readLine();
		int beginIndex = str.lastIndexOf("=")+2;
		System.out.println(beginIndex);
		int endIndex  = str.lastIndexOf("\"");
		String fileName = str.substring(beginIndex, endIndex);
		System.out.println(fileName);
		//重新定位文件指针文件头位置
		randomFile.seek(0);
		//文件内容开始位置
		long startPosition = 0;
		int i = 1;
		while((n=randomFile.readByte())!=-1 && i<=4){
			if(n=='\n'){
				startPosition = randomFile.getFilePointer();
				i++;
			}
		}
		//startPosition = startPosition -1;
		System.err.println(startPosition);
		//文件内容结束位置
		randomFile.seek(randomFile.length());
		long endPosition = randomFile.getFilePointer();
		int j = 1;
		while(endPosition>=0 && j<=2){
			endPosition--;
			randomFile.seek(endPosition);
			if(randomFile.readByte()=='\n'){
				j++;
				System.out.println(endPosition);
			}
		}
		endPosition = endPosition -1;
		System.err.println("endPosition="+endPosition);
		//设置文件保存的路径
		//File directory = new File("");// 参数为空
		//String savePath =req.getRealPath("").substring(0, req.getRealPath("").lastIndexOf("\\")+1)+"upLoad";
		String savePath =req.getRealPath("/")+"upLoad";
				//req.getSession().getServletContext().getRealPath("/")+"/static/images";//this.getClass().getResource("/").getPath();
		System.err.println(savePath);
		File newFile = new File(savePath);
		if(!newFile.exists()){
			newFile.mkdir();
		}
		File saveFile = new File(savePath,fileName);
		RandomAccessFile rand = new RandomAccessFile(saveFile, "rw");
		//从临时文件中读取文件内容
		randomFile.seek(startPosition);
		while(startPosition<endPosition){
			rand.write(randomFile.readByte());
			startPosition = randomFile.getFilePointer();
		}
		//关闭输入输出流，删除临时文件
		rand.close();
		randomFile.close();
		
		tempFile.delete();
		
		req.setAttribute("resultImg", "上传成功！");
		
	}

	@Override
	public boolean update(TUser tuser) {
		//System.err.println(tuser.getUserId());
		
		int a=tUserMapper.updateByPrimaryKey(tuser);
		 if(a>=1){
			 return true;
		 }
			return false;
		}
}
