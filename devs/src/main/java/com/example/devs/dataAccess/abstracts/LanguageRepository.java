package com.example.devs.dataAccess.abstracts;

import java.util.List;

import com.example.devs.entities.concretes.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	Language getById(int id) throws Exception;
	void create(Language language);
	void update(Language language, int id) throws Exception;
	void delete(int id) throws Exception;
}
