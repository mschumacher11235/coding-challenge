import { browser, by, element, ElementFinder } from 'protractor';

export class AppPage {

  inputString: ElementFinder;
  outputString: ElementFinder;
  submitButton: ElementFinder;

  constructor() {
    this.inputString = element(by.css('[name="input"]'));
    this.outputString = element(by.css('[name="output"]'));
    this.submitButton = element(by.css('[type="submit"]'));
  }

  navigateTo() {
    return browser.get(browser.baseUrl) as Promise<any>;
  }

  getTitleText() {
    return element(by.css('app-root h2')).getText() as Promise<string>;
  }

  getSubTitleText() {
    return element(by.css('app-root h4')).getText() as Promise<string>;
  }

  getSubmitIsEnabled() {
    return this.submitButton.isEnabled();
  }

  enterInputText(inputText: string) {
    this.inputString.sendKeys(inputText);
  }

  async clickSubmitButton() {
    await this.submitButton.click();
  }

  getOutputText() {
    return this.outputString.getAttribute('value');
  }
}
