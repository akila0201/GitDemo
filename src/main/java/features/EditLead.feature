Feature: Create Editlead functionality of Leaftaps Application
Scenario Outline: EditLead with different set of data
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to home screen
When click on the crmsfalink
And Click on the Leads link
And Click on the Find Lead
When Click on the Phone tab 
Given Enter the phonenumber as <phonenumber>
When Click on Find lead 
And Click on the Lead ids
When Click on the EditLead button 
Given update the companyname as <companyname>
When Click on the update button
Then Lead should be Edited 

Examples:
|phonenumber|companyname|
|99|HCL|
|90|Newcompany2|