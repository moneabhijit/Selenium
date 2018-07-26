from selenium import webdriver
browser = webdriver.Chrome("J://Driver/chromedriver.exe")
browser.get('https://www.seleniumhq.org/')
browser.find_element_by_link_text('Download')
elem = browser.find_element_by_link_text('Download')
elem.click()
elem = browser.find.element_by_id('q')
searchBar.sendkeys('download')
from selenium.webdriver.common.keys import Keys
searchBar.send_keys(keys.ENTER)
