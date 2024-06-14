# Order2Cash Application

Du bist dabei eine Order2Cash Application zu entwickeln. Diese Anwendung soll es ermöglichen, dass ein Kunde eine
Bestellung aufgibt und diese Bestellung dann geprüft und schlussendlich bezahlt werden kann.

## 1. Step: Verstehe den Aufbau

Dazu solltest du dir zuerst einmal den Aufbau der Anwendung ansehen. Die Anwendung besteht aus folgenden Komponenten:

- Adapter: In diesem Teil der Anwendung findet die Integration zur Außenwelt statt. Hier werden die Schnittstellen zu
  anderen Systemen angebunden.
- Application: In diesem Teil der Anwendung sind die Schnittstellen definiert, die die Anwendung nach außen hin anbietet
  und die Use Cases implementiert.
- Domain: Das ist der Kern unserer Domäne und beinhaltet die Domain Objekte.

Mehr dazu findest du in einem ausführlichen Blogpost unter: https://reflectoring.io/spring-hexagonal/

Du bist bereit und hast ein grobes Verständnis? Dann geht es weiter!

## 2. Step: Mit dem Prozess stimmt etwas nicht

Leider sind wir keine BPMN Experten und haben ein paar Details im Modell vergessen...
Bitte ergänze den Prozess, sodass er korrekt mit unseren Workern interagiert.
Wir sind außerdem Fans von Unit-Tests und würden uns freuen, wenn du den Prozess testen könntest.
Worker sollten mitgetestet werden, den Rest kannst du mocken.
Die Klasse dafür findest du unter `src/test/kotlin/io/miragon/exercise/order/Order2CashProcessTest.kt`.

## 3. Step: Check order

Der Order Check muss implementiert werden. Hierbei soll geprüft werden, ob die Bestellung einen bestimmten Wert
überschreitet. Wenn der Wert größer als 1000 ist, soll der Prozess abgebrochen werden. Ansonsten soll der Prozess
weiterlaufen. Worker, Use Case und Service sind bereits vorhanden. Du musst nur noch die Implementierung vornehmen.

## 4. Step: Payment

Die Bestellung soll bezahlt werden. Aber wie bringen wir die Informationen an den Prozess?

Es ist bereits ein Rest Controller für das Payment vorhanden.
Der Payment Use Case muss aber noch implementiert werden.
Dabei soll die Order geladen und auf bezahlt gesetzt werden.
Zusätzlich soll im SendPaymentOutPort eine Nachricht an den Prozess gesendet werden.
Hilf uns dabei! 