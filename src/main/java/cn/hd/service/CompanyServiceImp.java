package cn.hd.service;

import java.util.List;

import cn.hd.model.PageBean;
import cn.hd.dao.CompanyDaoImp;
import cn.hd.model.Loader;

public class CompanyServiceImp {
	private CompanyDaoImp cpDao = new CompanyDaoImp();

	// ��ȡͬ���б�
	public PageBean getCpList(PageBean page, String lodgingInfo) {
		int _page = page.getPage();
		_page = (_page > 0) ? _page : 1; // {1}����ҳ��Ƿ�����
		int count = 0;
		// {3}�õ�ҳ��С
		int pageSize = page.getLimit();
		pageSize = (pageSize > 0) ? pageSize : 1;
		List<Loader> list = cpDao.getCpList(lodgingInfo, _page, page.getLimit());
		PageBean pBean = new PageBean();
		pBean.setList(list);
		pBean.setCount(count);
		return pBean;
	}
}
