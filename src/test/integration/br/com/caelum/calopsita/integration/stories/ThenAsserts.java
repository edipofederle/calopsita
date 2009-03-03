package br.com.caelum.calopsita.integration.stories;

import static org.hamcrest.Matchers.containsString;

import org.junit.Assert;

import br.com.caelum.seleniumdsl.Browser;

public class ThenAsserts {

    private final Browser browser;
	private String name;

    public ThenAsserts(Browser browser) {
        this.browser = browser;
    }

    public void iMustBeLoggedInAs(String login) {
        String div = this.browser.currentPage().div("user").innerHTML();
        Assert.assertThat(div, containsString(login));
        Assert.assertThat(div, containsString("Logout"));
    }

    public void iShouldSeeTheError(String error) {
        String div = browser.currentPage().div("errors").innerHTML();
        Assert.assertThat(div, containsString(error));
    }

    public void iMustNotBeLoggedIn() {
        String div = this.browser.currentPage().div("user").innerHTML();
        Assert.assertThat(div, containsString("Login"));
    }

    public void iAmBackToLoginPage() {
        String div = this.browser.currentPage().div("login").innerHTML();
        Assert.assertThat(div, containsString("Login"));
        Assert.assertThat(div, containsString("Password"));
    }

	public ThenAsserts project(String name) {
		this.name = name;
		return this;
	}

	public void appearsOnList() {
		// TODO Auto-generated method stub
		
	}

}
