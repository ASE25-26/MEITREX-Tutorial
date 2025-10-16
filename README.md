# Hello MEITREX

Willkommen zu deiner **ersten MEITREX-Programmieraufgabe**!   
In diesem Tutorial lernst du, wie du mit **GitHub Classroom** arbeitest, deine Lösung mit **Git** pushst und wie **automatische Tests** deinen Code überprüfen.
Das Ergebnis der automatisierten Tests wird dir in dem Code Assignment in MEITREX angezeigt.

---

## Ziel der Aufgabe

Schreibe ein einfaches Java-Programm, das auf der Konsole den Text  
```
Hello MEITREX
```
ausgibt.

Diese Aufgabe soll dir zeigen, wie du deinen Code mit **Git** einreichst und dein Ergebnis in **MEITREX** einsiehst 

---

## So gehst du vor

1. Klicke in **MEITREX** auf **„START ASSIGNMENT“** – du wirst zu GitHub Classroom weitergeleitet.
2. Akzeptiere das Coding Assignment in GitHub Classroom (**Accept this assignment**).  
3. Ein persönliches Repository (z. B. `meitrex-tutorial-code-assignment-username`) wird erstellt.  
4. Klone es auf deinen Rechner:  
   ```bash
   git clone <dein-repo-link>
   ```
5. Öffne das Projekt in deiner IDE (z. B. IntelliJ oder VS Code).  
6. Implementiere den Code in `Main.java`.  
7. Teste dein Programm lokal und **pushe** es dann:  
   ```bash
   git add .
   git commit -m "Hello MEITREX Aufgabe gelöst"
   git push
   ```
8. GitHub Classroom führt die automatisierten Tests aus (Das kann bis zu einer Minute dauern)
9. Schau in MEITREX nach der Bewertung.

---

## Aufgabenbeschreibung

Du findest im Repository eine Datei:

```
src/main/java/Main.java
```

Ergänze den Code so, dass beim Ausführen des Programms **Hello MEITREX** auf der Konsole ausgegeben wird.

```java
public class Main {
    public static void main(String[] args) {
        // TODO: Gib "Hello MEITREX" auf der Konsole aus
    }
}
```

---

## Automatische Tests

Deine Lösung wird nach jedem Push automatisch getestet.  
Das Ergebnis wird dir in dem jeweiligen Code Assignment in MEITREX angezeigt.

**Viel Erfolg!**
