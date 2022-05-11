
 Feature: TechFios Portal Background functionality validation
 
 Background:
 Given user is on techfios test page
 
 @Scenario1
 Scenario: User should be able to change background color to sky blue then back to white
 When button Set SkyBlue Background exists 
 When user clicks on blue button
 Then the background color will change to sky blue
 
 @Scenario2
 Scenario: User should be able to change background color back to white
 When  button Set SkyWhite Background exists
 When user clicks on white button
 Then the background color will change to white
 
 