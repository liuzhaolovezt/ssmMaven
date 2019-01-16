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
	public PagerUtil() {
		
	}
	
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
	
}
