package com.macrosoftas.controller.form;

import lombok.Data;

@Data
public class CommandForm {
	
	String textField;
	
	String textareaField;
	
	String datetimeField;
	
	String colorField;
	
	boolean singleCheckboxField;
	
	String[] multiCheckboxSelectedValues;
	
	String radioButtonSelectedValue;

	String dropdownSelectedValue;

}