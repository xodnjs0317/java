package test17;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

/*
 * 프로퍼티 에디터 (property editor)란?
 * 문자열을 특정 타입의 값으로 변환해주는 객체
 * 
 * 스프링에서는 java.util.date 처럼 자주 사용하는 타이에 대해
 * 몇가지 프로퍼티 에디터를 제공합니다. 날짜 형식의 문자열을 date 객체로 변환해주는 
 * customdateEditor 클래스와 url형식의 문자열을 java.util.url 객체로
 * 변환해주는 urlEditor 등이 있습니다.
 * 
 */


public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar{

	CustomDateEditor customDateEditor;
	
	 public void setCustomDateEditor(CustomDateEditor customDateEditor) {
		this.customDateEditor = customDateEditor;
	}
	 
	//스프링 컨테이너가 제공해준 에디터 등록기를 사용하여 date 타입에 대한 
	//프로퍼티 에디터를 등록합니다.앞으로 date타입의 프로퍼티 값을 처리할때는 등록한
	//customdateeditor가 사용됩니다.
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(java.util.Date.class, customDateEditor);
		
	}
		
	

	
}
