# Design pattern : Factory

## Qu'est-ce que le Factory Method ?

Le **Factory Method** est un design pattern qui définit une interface pour créer un objet, mais laisse les sous-classes décider quelle classe instancier. Cela permet à une classe de déléguer l'instanciation à des sous-classes.

## Poruquoi utiliser le Factory Method ?

### Flexibilité :
- Vous pouvez introduire de nouvelles classes de produits sans casser le code existant.

### Découplage :
- Le code client est découplé des classes  concrètes qu'il utilise, car il interagit uniquement avec l'interface.

### Extensibilité :
- Vous pouvez facilement ajouter de nouveaux types de produits en créant de nouvelles sous-classes.

## Comment ça marche

Se référer à l'exercice opéré.

### Explication du code

1. **Interface `Pizza`:**
- Définit une méthode `prepare`que toutes les pizzas doivent implémenter.

2. **Classes concrètes de Pizza :**
- `Margherita`, `Pepperoni` et `Regina`implémentent l'interface `Pizza`et définissent comment préparer chaque type de pizza.

3. **Classe abstraite `Pizzaiolo`:**
- Définit une méthode `preparePizza()`que toutes les usines de pizzas doivent implémenter.

4. **Classes concrètes de Pizzaiolo :**
- `PepperoniFactory`et `ReginaFactory`implémentent `Pizzaiolo`.

5. **Utilisation :**
- Dans la classe `Main`, on créé des instances de `PepperoniFactory`et `ReginaFactory`et on utilise ces usines pour préparer les pizzas.

## Avantages

- **Flexibilité :** Vous pouvez facilement ajouter de nouveaux types de pizzas en créant de nouvelles classes concrètes.
- **Découplage :** Le code client est découplé des casses concrètes de pizzas, car il interagit uniquement avec l'interface **Pizza**.
- **Extensibilité :** Vous pouvez facilement ajouter de nouvelles usines de pizzas en créant de nouvelles sous-classes de **Pizzaiolo**.

## conclusion

En résumé, le design pattern **Factory Method** est un outil puissant pour créer des objets de manière flexible et extensible. Il est particulièrement utile lorsque vous avez besoin de créer des objets de différentes classes, mais que vous ne connaissez pas à l'avance les types exacts d'objets que votre code dvra créer.