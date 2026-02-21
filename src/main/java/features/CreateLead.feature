Feature: Create lead functionality of Leaftaps Application
Scenario Outline: CreateLead with different set of data
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to home screen
When click on the crmsfalink
And Click on the Leads link
And Click on the Create Lead
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on the CreateLead button
Then Lead should be created

Examples:
|companyname|firstname|lastname|
|sample|Akila|K|
|Dummy|Dexu|A|
