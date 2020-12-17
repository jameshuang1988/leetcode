package org.must.must.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(path = "/james")
public class ThymeleafController {

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("test/index");
		view.addObject("title", "Thymeleaf TEST");
		view.addObject("desc", " welcome to Thymeleaf web 系统");
		Author author = new Author();
		author.setAge(30);
		author.setEmail("james.huang@must.org.com");
		author.setName("詹姆斯");
		view.addObject("author", author);
		return view;
	}

	@GetMapping("/index1")
	public String index1(HttpServletRequest request) {
		// TODO 與上面的寫法不同，但是结果一致。
		request.setAttribute("title", "Thymeleaf TEST 2 ");
		request.setAttribute("desc", "welcome to Thymeleaf web 系统 第二頁");
		Author author = new Author();
		author.setAge(30);
		author.setEmail("james.huang@must.org.com");
		author.setName("詹姆斯");
		request.setAttribute("author", author);
		// 返回的 index 默認映射到 src/main/resources/templates/xxxx.html
		return "test/index";
	}

	@GetMapping("/index2")
	public String index2(HttpServletRequest request) {
		// TODO 與上面的寫法不同，但是结果一致。
		log.info("進入Controller index2");
		request.setAttribute("title", "Thymeleaf TEST 3 ");
		request.setAttribute("desc", "welcome to Thymeleaf:vue.js web 系统 第三頁");
		Author author = new Author();
		author.setAge(30);
		author.setEmail("james.huang@must.org.com");
		author.setName("詹姆斯");
		request.setAttribute("author", author);
		// 返回的 index 默認映射到 src/main/resources/templates/xxxx.html
		return "test/vueTest";
	}

	class Author {
		private int age;
		private String name;
		private String email;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

}
