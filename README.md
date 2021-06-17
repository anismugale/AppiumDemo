# AppiumDemo

### Prerequisites-

  * Android SDK.
  * Nodejs and npm
  * Real device connected or emulator.
  * If you are using real device make sure that usb debugging option is enabled.
  
### Executing tests on host-

  * Collect your device name which is connected with your system.
  * Enter your device name into the given command.
  * Use the below given command to execute the tests from your project directory.<br />
    		 mvn test -DdeviceName=YourDeviceName
     
### Reports-

  * Checkout the reports generated after execution of tests.
  * After execution remember to refresh the project to see the reports.
  * We can also see the screenshots for failed tests inside the screenshot folder of project directory.
  * Following are the reports with their location in the project directory.<br />
     		 1.Extent Report (/target/surefire-report/Extent.html)<br />
     		 2.Index Report (/target/surefire-report/Index.html)<br />
  
