package com.ssm.util;

import java.util.List;
/**
 * 页面数据对象
 * @author Administrator
 *
 */
public class PagerUtil {
	/**
	 * 第几页
	 */
	private Integer page;
	/**
	 * 每页条数
	 */
	private Integer size;
	/**
	 * 总页数
	 */
	private Integer totalPage;
	/**
	 * 总记录
	 */
	private Integer totalRecord;
	/**
	 * 每页的数据
	 */
	private List data;
	
	
	public Integer getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(Integer totalRecord) {
		this.totalRecord = totalRecord;
	}

	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public List getData() {
		return data;
	}
	public void setData(List data) {
		this.data = data;
	}
	/**
	 * 封装分页对象
	 * @param currentPage 当前页 
	 * @param noticeNum   总条数
	 *  @param pageSize  每页条数
	 */
	public static PagerUtil getPagerUtil(int currentPage,int noticeNum,int pageSize) {
        
		PagerUtil pagerUtil = new PagerUtil();
		pagerUtil.setTotalRecord(noticeNum);
		// 第几页
		pagerUtil.setPage(currentPage);
		// 每页条数
		pagerUtil.setSize(pageSize);
		// 封装总页数
		if (noticeNum % pageSize != 0) {
			pagerUtil.setTotalPage(noticeNum / pageSize + 1);
		} else {
			pagerUtil.setTotalPage(noticeNum / pageSize);
		}
		return pagerUtil;
	}
	
	
}
