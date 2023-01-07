package im.design.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import im.design.entity.Account;
import im.design.mapper.AccountMapper;
import im.design.service.AccountService;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountMapper accountMapper;

	public List<Account> findAllAccount() {
		return accountMapper.fetchList();
	}

	public void saveAccount(Account account) {
		accountMapper.save(account);
	}

}
