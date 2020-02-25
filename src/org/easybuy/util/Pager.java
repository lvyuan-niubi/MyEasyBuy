package org.easybuy.util;
import java.io.Serializable;
public class Pager implements Serializable{
	private int currentPage;//当前页
	private int rowCount;//总条数
	private int rowPerPage;//每页显示条数
	private int pageCount;//总页数

	private int temp;

	private String url;

	//公式: limit (当前页码-1) * 每页显示行数 , 每页显示行数;
	// 总条数 显示条数 当前页
	public Pager(int rowCount, int rowPerPage, int currentPage) {
		this.rowCount = rowCount;
		this.rowPerPage = rowPerPage;
		this.currentPage = currentPage;
		//当 总条数 磨 显示条数 能够整除
		if(this.rowCount % this.rowPerPage == 0){
			this.pageCount = this.rowCount / this.rowPerPage;
		//当 总条数 磨 显示条数 大于0
		}else if(this.rowCount % this.rowPerPage > 0){
			this.pageCount = this.rowCount / this.rowPerPage + 1;
		}else{
			//否则出错 总页数清零
			this.pageCount = 0;
		}
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public int getRowPerPage() {
		return rowPerPage;
	}

	public void setRowPerPage(int rowPerPage) {
		this.rowPerPage = rowPerPage;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
