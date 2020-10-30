package test17;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.propertyeditors.CustomDateEditor;

/*
 * ������Ƽ ������ (property editor)��?
 * ���ڿ��� Ư�� Ÿ���� ������ ��ȯ���ִ� ��ü
 * 
 * ������������ java.util.date ó�� ���� ����ϴ� Ÿ�̿� ����
 * ��� ������Ƽ �����͸� �����մϴ�. ��¥ ������ ���ڿ��� date ��ü�� ��ȯ���ִ� 
 * customdateEditor Ŭ������ url������ ���ڿ��� java.util.url ��ü��
 * ��ȯ���ִ� urlEditor ���� �ֽ��ϴ�.
 * 
 */


public class CustomPropertyEditorRegistrar implements PropertyEditorRegistrar{

	CustomDateEditor customDateEditor;
	
	 public void setCustomDateEditor(CustomDateEditor customDateEditor) {
		this.customDateEditor = customDateEditor;
	}
	 
	//������ �����̳ʰ� �������� ������ ��ϱ⸦ ����Ͽ� date Ÿ�Կ� ���� 
	//������Ƽ �����͸� ����մϴ�.������ dateŸ���� ������Ƽ ���� ó���Ҷ��� �����
	//customdateeditor�� ���˴ϴ�.
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(java.util.Date.class, customDateEditor);
		
	}
		
	

	
}
