package im.design.mapper;

import java.util.List;

import im.design.entity.Account;

/**
 * 账户接口
 * @author Administrator
 *
 */
public interface AccountMapper {
	// 查询所有账户信息
	public List<Account> fetchList();
	
	// 保存账户信息
	public int save(Account account);

}
