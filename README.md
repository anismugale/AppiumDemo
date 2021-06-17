# AppiumDemo

# Prerequisites-

  1.Android SDK.
  2.Nodejs and npm
  3.Real device connected or emulator.
  4.If you are using real device make sure that usb debugging option is enabled.
  
# Executing tests on host-

  1.Collect your device name which is connected with your system.
  2.Enter your device name into the given command.
  3.Use the below given command to execute the tests from your project directory.
     mvn test -DdeviceName=YourDeviceName
     
# Reports-

  1.Checkout the reports generated after execution of tests.
  2.After execution remember to refresh the project to see the reports.
  3.We can also see the screenshots for failed tests inside the screenshot folder of project directory.
  4.Following are the reports with their location in the project directory.
      -Extent Report (/target/surefire-report/Extent.html)
      -Index Report (/target/surefire-report/Index.html)
  
