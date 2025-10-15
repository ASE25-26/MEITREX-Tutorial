# MEITREX-Tutorial – Coding Assignment

Willkommen zu deiner ersten **Programmieraufgabe im MEITREX-Tutorial** 
Diese Aufgabe zeigt dir, wie du mit **GitHub Classroom** arbeitest und wie dein Code automatisch getestet wird.  
Wenn du den Code korrekt implementierst und die Tests bestehst, wird dein Ergebnis automatisch in **MEITREX** angezeigt.

---

## Ziel der Aufgabe

Implementiere eine Methode, die die **Fakultät einer natürlichen Zahl** berechnet.  
Die Fakultät (engl. *factorial*) einer Zahl `n` ist das Produkt aller positiven ganzen Zahlen bis `n`.

Beispiel:

```
n! = 1 × 2 × 3 × ... × n
```

Daraus ergibt sich:
```
0! = 1  
4! = 24  
5! = 120
```

---

## Aufgabenbeschreibung

Du findest im Repository eine Datei:

```
src/main/java/Main.java
```

Darin ist eine Methode vorbereitet, die du implementieren sollst:

```java
public static long factorial(int n) {
    // TODO: Implementiere deine Lösung hier
    return 0;
}
```

### Anforderungen

- Gib **1** zurück, wenn `n == 0`.
- Wirf eine **IllegalArgumentException**, wenn `n < 0`.
- Berechne das Ergebnis korrekt für alle Zahlen zwischen **0** und **20**  
  (größere Zahlen würden einen `long`-Überlauf erzeugen).
- Du darfst **rekursiv oder iterativ** vorgehen – beide Varianten sind erlaubt.
- Dein Code sollte **lesbar** und **gut kommentiert** sein.

---

## Automatische Tests

Deine Lösung wird nach jedem Push automatisch mit **JUnit** getestet.  
Wenn du alle Tests bestehst, erscheinen grüne Haken in deinem Repository  
und MEITREX zeigt den Status als **„Bestanden“** an.

## Hinweise zur Arbeit mit GitHub Classroom

1. Klicke in **MEITREX** auf **„Aufgabe starten“** – du wirst zu GitHub Classroom weitergeleitet.  
2. Es wird ein eigenes Repository für dich erstellt (z. B. `meitrex-tutorial-username`).  
3. Klone das Repository auf deinen Rechner:
   ```bash
   git clone <dein-repo-link>
   ```
4. Implementiere deine Lösung in `Main.java`.

Viel Erfolg und willkommen im **MEITREX Java-Tutorial!**
