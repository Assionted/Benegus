package im.design.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import im.design.entity.Account;
import im.design.service.AccountService;

// 账户控制器
@Controller
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		// 使用RequestBody来标识这个方法，这样返回的就是一个字符串，不然springmvc就会去寻找同名的jsp文件
		return "hello world";
	}
	
	// 查询账户列表
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		// 调用 service 方法
		List<Account> list = accountService.findAllAccount();
		model.addAttribute("list",list);
		return "list";
	}
	
	// 保存账户数据
	@RequestMapping("/save")
	public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 调用 service 方法
		accountService.saveAccount(account);
		response.sendRedirect(request.getContextPath()+"/account/findAll");
		return;
	}
	
}
