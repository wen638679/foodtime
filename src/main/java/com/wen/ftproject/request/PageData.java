package com.wen.ftproject.request;

public class PageData {
	private Integer pageNum;
	private Integer pageSize;
	private Integer pageStart;
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageStart() {
		return pageStart;
	}
	public void setPageStart(Integer pageStart) {
		this.pageStart = pageStart;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	@Override
	public String toString() {
		return "PageData [pageNum=" + pageNum + ", pageSize=" + pageSize + ", pageStart=" + pageStart + "]";
	}
}
