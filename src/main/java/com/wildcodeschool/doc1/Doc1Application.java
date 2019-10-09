
package com.wildcodeschool.doc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Doc1Application {


	public static void main(String[] args) {

		SpringApplication.run(Doc1Application.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String docteurs() {
		return "<ul> <li ><a href = '/docteur/1'>William Hartnell</a></li>" +
			"<li ><a href = '/docteur/2'>Patrick_Troughton</a></li>" +
			"<li ><a href = '/docteur/3'>Jon Pertwee</a></li>" +
			"<li ><a href = '/docteur/4'>Tom Baker</a></li>" +
			"<li ><a href = '/docteur/5'>Peter Davison</a></li></ul>";
	}

	@RequestMapping("/docteur/1")
	@ResponseBody
	public String docteur1() {
		return "<a href= 'https://en.wikipedia.org/wiki/William_Hartnell'>What about the Doctor 1 ,William Hartnell?</a>";
	}

	@RequestMapping("/docteur/2")
	@ResponseBody
	public String docteur2() {
		return "<a href= 'https://en.wikipedia.org/wiki/Patrick_Troughton'>What about the Doctor 2 ,Patrick_Troughton</a>";
	}

	@RequestMapping("/docteur/3")
	@ResponseBody
	public String docteur3() {
		return "<a href= 'https://en.wikipedia.org/wiki/Jon_Pertwee'>What about the Doctor 3 ,Jon Pertwee</a>";
	}

	@RequestMapping("/docteur/4")
	@ResponseBody
	public String docteur4() {
		return "<a href= 'https://en.wikipedia.org/wiki/Tom_Baker'>What about the Doctor 4 ,Tom Baker</a>";
	}

	@RequestMapping("/docteur/5")
	@ResponseBody
	public String docteur5() {
		return "<a href='https://en.wikipedia.org/wiki/Peter_Davison'>What about the Doctor 5 ,Peter Davison</a>";
	}
}
