package com.example.devs.webApi.controlles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.devs.business.abstracts.LanguageService;
import com.example.devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {
	private LanguageService languageService;

	@Autowired
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@GetMapping("/getAll")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	
	@GetMapping("/{id}")
	public Language getById(@PathVariable() int id) throws Exception {
		return languageService.getById(id);
	}

	@PostMapping("/add")
	public void create(@RequestBody Language language) throws Exception {
		languageService.create(language);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Language language, @PathVariable int id) throws Exception {
		languageService.update(language, id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") int id) throws Exception {
		languageService.delete(id);
	}
}
