import { AppPage } from './app.po';
import { browser, logging } from 'protractor';

describe('CharGrouper App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
  });

  it('should display title text(s)', () => {
    page.navigateTo();
    expect(page.getTitleText()).toEqual('CharGrouper');
    expect(page.getSubTitleText()).toEqual('Enter a string on the left and see the result on the right');
  });

  it('should group input text', async () => {
    page.navigateTo();
    expect(page.getSubmitIsEnabled()).toBe(false);

    page.enterInputText('abzuaaissna');
    expect(page.getSubmitIsEnabled()).toBe(true);

    await page.clickSubmitButton();
    expect(page.getOutputText()).toBe('a4binssuz');
  });

  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
});
