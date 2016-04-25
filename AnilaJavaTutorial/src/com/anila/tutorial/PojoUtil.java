package com.anila.tutorial;

import java.util.ArrayList;
import java.util.List;

public class PojoUtil {

	public void utilizePojo() {
		AnilaJavaTutorial tut = new AnilaJavaTutorial();
		tut.setAge(28);
		tut.setCity("Albany");
		tut.setHeight(5.7);
		tut.setName("Anila");
		tut.setState("New York");

		List<AnilaJavaTutorial> listTut = new ArrayList<AnilaJavaTutorial>();
		listTut.add(tut);
		System.out.println(listTut.size());
	}

}
