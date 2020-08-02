package tech.nosy.nosyemail.nosyemail.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import tech.nosy.nosyemail.nosyemail.exceptions.EmailTemplateNameInvalidException;


@RunWith(MockitoJUnitRunner.class)
public class EmailTemplateTest {

    @Test(expected = EmailTemplateNameInvalidException.class)
    public void onCreateTest() {
        EmailTemplate emailTemplate=new EmailTemplate();
        emailTemplate.onCreate();
    }
    @Test(expected = EmailTemplateNameInvalidException.class)
    public void onCreateEmptyTest() {
        EmailTemplate emailTemplate=new EmailTemplate();
        emailTemplate.setEmailTemplateName("");
        emailTemplate.onCreate();
    }
    @Test(expected = Test.None.class)
    public void onCreateSuccessTest() {
        EmailTemplate emailTemplate=new EmailTemplate();
        emailTemplate.setEmailTemplateName("dasdas");
        emailTemplate.onCreate();
    }
}
