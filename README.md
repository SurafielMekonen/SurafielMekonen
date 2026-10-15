# Jarvis voor Android

Een eigen spraakassistent: zeg "Jarvis", zeg wat je wilt, en hij doet het. Werkt ook als het scherm vergrendeld is.

## Wat kan hij

- sms sturen (direct, zonder tikken)
- WhatsApp sturen (opent het gesprek en tikt zelf op Verzenden)
- e-mail opstellen en versturen (via je e-mailapp)
- Google zoeken
- agenda lezen en afspraken toevoegen
- apps openen, bellen, timers zetten
- posten namens jou op X, LinkedIn, Facebook en Threads
- privéberichten via Instagram, Telegram, Messenger, Snapchat en Signal (de app opent, Jarvis tikt op de naam en op Verzenden)
- Instagram- en TikTok-posts kunnen niet: die vereisen een foto of video, geen losse tekst

## Installeren (eenmalig, ca. 15 minuten)

1. Installeer **Android Studio** op je pc en kies *Open* -> map `jarvis`. Laat Gradle synchroniseren.
2. Maak een Claude API-sleutel op https://console.anthropic.com
3. Maak een gratis Picovoice access key op https://console.picovoice.ai (voor het wake word "Jarvis").
4. Zet op je telefoon *Ontwikkelaarsopties -> USB-foutopsporing* aan, sluit hem aan en druk in Android Studio op **Run**.
5. Open de app Jarvis en doorloop de knoppen van boven naar beneden:
   - sleutels invullen
   - toestemmingen geven
   - "over andere apps heen tonen" toestaan
   - toegankelijkheid -> Jarvis aanzetten
   - batterij: niet beperken
   - **Opslaan en Jarvis starten**

Zeg nu "Jarvis" en daarna bijvoorbeeld: "Stuur Anna een WhatsApp dat ik tien minuten later ben".

## Vergrendeld scherm: wat wel en niet kan

- Wake word, luisteren, antwoorden, sms, agenda en timers werken op een vergrendeld scherm.
- Acties die een andere app openen (WhatsApp, e-mail, Google, X) vragen je eerst te ontgrendelen met je vingerafdruk of pincode. Android staat niet toe dat een app het slot omzeilt. Na het ontgrendelen gaat Jarvis zelf verder.

## Beperkingen

- Android 14 en nieuwer staan niet toe dat een microfoon-service automatisch na het opstarten van de telefoon begint. Open de app na een herstart één keer en druk op starten.
- De "Verzenden"-knop wordt gevonden op de tekst "Verzenden" of "Send". Bij een andere app-taal of na een app-update kan dat aangepast moeten worden in `Tools.kt`.
- Instagram, TikTok en Facebook hebben geen publieke post-link zoals X. Daarvoor kan Jarvis alleen de app openen.
- Sleutels staan in gewone app-opslag op je eigen telefoon. Gebruik een sleutel met een uitgavenlimiet.
- Het wake word luistert continu en kost batterij (ongeveer 1 tot 3 procent per uur, afhankelijk van het toestel).
- De code is niet gecompileerd of op een toestel getest. Mogelijk moeten er kleine aanpassingen gebeuren (bijvoorbeeld de Porcupine-versie in `app/build.gradle.kts`).

## Uitbreiden

Elke actie is één blok in `Tools.kt`: een beschrijving in `schema()` en een functie in `run()`. Claude kiest zelf welke tool hij gebruikt.
