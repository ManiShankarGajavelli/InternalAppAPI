package com.cnsi.interanalAppAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnsi.interanalAppAPI.model.Appdetails;
import com.cnsi.interanalAppAPI.repository.AppRepository;

@CrossOrigin
@RestController
public class AppController {

	@Autowired
	AppRepository apprepo;
	
	@RequestMapping("/viewApps")
	private  List<Appdetails> viewApps() {
		return apprepo.findAll();
	}
	
	@RequestMapping("/addapp")
	private  List<Appdetails> addapp(@RequestParam String appname,@RequestParam String appurl) {
		Appdetails app = new Appdetails(appname, appurl);
		apprepo.save(app);
		return apprepo.findAll();
	}
}
