package CRMNextBaseProject;

import org.openqa.selenium.support.PageFactory;

public class PageGenerator extends Driver {

    public PageGenerator() {
        PageFactory.initElements(getDriver(), this);
    }
}
