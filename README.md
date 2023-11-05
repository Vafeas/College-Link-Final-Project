# College-Link-Final-Project
Task 1: Create Maven automation testing project:


a) Να δημιουργήσετε ένα καινούργιο maven project στο IntelliJ με τίτλο: "web-automationtesting".

b) Να δηλώσετε στο project σας Java version 17 ή και κάποια πιο καινούργια.

c) Να χρησιμοποιήσετε σαν testing framework για την εκτέλεση των αυτοματοποιημένων 
δοκιμών το εργαλείο TestNG.

d) Να χρησιμοποιήσετε για να δημιουργήσετε τα automated tests το εργαλείο Selenium
WebDriver.

e) Να χρησιμοποιήσετε σαν reporting tool το εργαλείο Allure.


Task 2: Create automated test scenarios:


a) Να δημιουργήσετε το πρώτο τεστ σενάριο που θα κάνει τα εξής:

i. Θα πηγαίνει στο στην αρχική σελίδα της amazon : https://www.amazon.com

ii. Θα γράφει στην search bar που υπάρχει πάνω στην σελίδα: lg tv 65 και θα 
πατάει search.

iii. Από την σελίδα των TVs που θα εμφανιστεί θα επιλέγει το τρίτο κατά σειρά 
εμφάνισης αντικείμενο.

iv. Στην επόμενη σελίδα που θα εμφανιστεί με τις λεπτομερείς θα κάνει:

1. Assert το Screen Size = 65 inches
   
3. Assert ότι το Brand είναι LG
   
b) Να δημιουργήσετε το δεύτερο τεστ σενάριο που θα κάνει τα εξής:

i. Θα πηγαίνει στο στην αρχική σελίδα του skroutz : https://www.skroutz.gr/

ii. Θα κάνει search στο search bar για iphone13.

iii. Θα επιλέγει από την αριστερή bar με τα φίλτρα, το φίλτρο: Οθόνη 6.0¨ -
6.4¨.

iv. Από τα αποτελέσματα στην λίστα θα κάνει click στο κινητό με τίτλο: Apple
iPhone 13 5G (4GB/128GB) Midnight.

v. Και στην νέα σελίδα που θα ανοίξει να κάνει assert:

1. Ότι ο τίτλος του κινητού είναι: Apple iPhone 13 5G (4GB/128GB) 
Midnight.

3. Ότι στα βασικά χαρακτηριστικά λέει: Δίκτυο σύνδεσης 5G
 
Task 3: Execute test scenarios:

Αφού υλοποιηθούν τα δύο automated test cases για να εκτελεστούν αυτές οι δοκιμές πρέπει να φτιάξετε 
μια suite (testing.xml) η οποία θα εκτελεί τις δυο δοκιμές παράλληλα.
