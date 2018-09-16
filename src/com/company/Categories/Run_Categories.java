package com.company.Categories;


import com.company.Date.DateValidator;
import com.company.Date.DateValidatorTest;
import com.company.FilesOperations.FileTestCases;
import com.company.NumericOperations.NumericTestCases;
import com.company.Paramatrized.UserLoginParameterized;
import com.company.UserValidationMethods.UserValidation;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)


@Categories.IncludeCategory({DATE.class,FILES.class,NUMERIC.class,USER_VALIDATION.class})

@Suite.SuiteClasses({DateValidatorTest.class,FileTestCases.class,UserLoginParameterized.class,NumericTestCases.class,UserValidation.class})
public class Run_Categories {




}
