# Tic-Tac-Toe

dit programma is een console-based versie van tic-tac-toe

## **`developer contributies`**

TKosterHZ en pieterjantreur

de github repository was niet perfect opgesteld dus moesten we de bestanden op het eind handmatig overzetten naar een branch.
TKosterHZ heeft de Game-, Board-, en de Main class geimplementeerd.
pieterjantreur heeft de Player-, HumanPlayer, InputAdapter interface en ConsoleInputAdapter classes geimplementeerd
TKosterHZ heeft de bestanden in 1 branch gezet, pieterjantreur heeft de README samengesteld.

### **`Board.java`**
- **Singleton Pattern**: 
  Dit patroon zorgt ervoor dat er slechts één instantie van het bord (`Board`) bestaat in het programma. De methode `getInstance()` zorgt ervoor dat dezelfde instantie wordt gebruikt gedurende het hele spel.
  
  **Waarom?**: Het bord is een gedeeld object dat door beide spelers wordt gebruikt. Het Singleton-patroon voorkomt dat er meerdere instanties van het bord worden aangemaakt, wat consistentie garandeert.

---

### **`Player.java`**
- **Factory Method Pattern**:
  `Player` is een abstracte klasse die de basis legt voor het aanmaken van spelers. Door het gebruik van het Factory Method-patroon kunnen verschillende soorten spelers worden aangemaakt, zoals de `HumanPlayer`.

  **Waarom?**: Dit maakt het eenvoudig om in de toekomst andere soorten spelers toe te voegen, bijvoorbeeld een AI-speler, zonder de kernlogica van het spel te wijzigen.

---

### **`HumanPlayer.java`**
- **Factory Method Pattern**:
  Dit bestand implementeert een concrete versie van de `Player` abstracte klasse. Het vertegenwoordigt een menselijke speler die interacteert met het spel via de console.

  **Waarom?**: Dit zorgt voor flexibiliteit in het toevoegen van verschillende soorten spelers aan het spel.

---

### **`InputAdapter.java`**
- **Adapter Pattern**:
  Dit bestand definieert een interface waarmee invoermechanismen abstract worden. Dit maakt het mogelijk om verschillende soorten invoer (zoals console-invoer of grafische invoer) te ondersteunen zonder de spelcode te wijzigen.

  **Waarom?**: Het Adapter-patroon zorgt ervoor dat het spel flexibel is en uitbreidbaar met nieuwe invoermechanismen.

---

### **`ConsoleInputAdapter.java`**
- **Adapter Pattern**:
  Een concrete implementatie van de `InputAdapter` interface die console-invoer ondersteunt. Hiermee kunnen gebruikers hun zetten invoeren via de terminal.

  **Waarom?**: Deze specifieke adapter maakt het mogelijk om console-invoer te gebruiken met het spel, terwijl andere adapters eenvoudig kunnen worden toegevoegd indien nodig.

---

### **`Game.java`**
- **Strategy Pattern**:
  Het spel gebruikt verschillende strategieën voor de invoer van spelers. De `makeMove`-methode van elke speler is een specifieke strategie die bepaalt hoe de speler met het bord interacteert.

  **Waarom?**: Dit maakt het mogelijk om invoerstrategieën eenvoudig te wisselen of uit te breiden, afhankelijk van de speler.

- **Observer Pattern**:
  Het spel controleert voortdurend de status van het bord en "meldt" aan de spelers wanneer het spel eindigt (winst, verlies of gelijkspel). Hoewel deze implementatie basaal is, kan deze worden uitgebreid om meer complexe meldingssystemen te ondersteunen.

  **Waarom?**: Het Observer-patroon houdt alle betrokken partijen op de hoogte van de veranderingen in de staat van het bord.
---
