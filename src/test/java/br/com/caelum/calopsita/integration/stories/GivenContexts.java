package br.com.caelum.calopsita.integration.stories;

import br.com.caelum.seleniumdsl.Browser;

public class GivenContexts {

    private final Browser browser;

    public GivenContexts(Browser browser) {
        this.browser = browser;
    }

    public void iAmOnTheRootPage() {
        browser.open("/calopsita");
    }

    public void iHaveAnUser(String string) {
    }

    public void iAmLoggedInAs(String string) {
        // TODO Auto-generated method stub

    }

}
