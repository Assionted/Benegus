package im.design.service;

import java.util.List;

import im.design.entity.Account;

public interface AccountService {
	
	// 查询所有账户信息
	public List<Account> findAllAccount();
	
	// 保存账户信息
	public void saveAccount(Account account);

}
