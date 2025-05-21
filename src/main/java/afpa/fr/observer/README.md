# Design Pattern : Observer

## Qu'est-ce que le design pattern Observer?

Le design pattern Observer est utilisé pour définir une dépendance un-à-plusieurs entre objets de sorte que lorsqu'un objet change d'état, tous ses dépendants sont notifiés et mis à jour automatiquement. C'est comme un système d'abonnement où les objets s'abonnent pour recevoir des notifications.

## Pourquoi utiliser Observer ?

### Notification automatique :
- Les objets observateurs sont automatiquement notifiés des changement d'état du sujet.

### Couplage faible :
- Le sujet et les observateurs sont faiblement couplés, ce qui facilite les modifications futures.

### Extensibilité :
 - Vous pouvez facilement ajouter ou supprimer des observateurs sans modifier le sujet.

## Comment ça marche ?

Se référer à l'exercice opéré.

### Explication du code

1. **Interface `AlertObserver`:**
- Définit une méthode `update` que tous les observateurs doivent implémenter.

2. **Interface `Sensor` :**
- Définit des méthodes pour s'abonner, se désabonner, notifier les observateurs, et simuler un événement de détection.

3. **Classes concrètes de capteurs :**
- `SmokeSensor`, `TemperatureSensor` et `NO2Sensor` implémentent l'interface `Sensor`et notifient les observateurs en cas de détection d'événement.

4. **Classes concrètes de systèmes d'alerte :**
- `EmailAlert`, `SmartphoneNotification`, `EmergencyCall`, `AlarmTrigger` implémentent l'interface `AlertObserver`et réagissent aux notifications des capteurs.

5. **Utilisation :**
- Dans la classe `Main`, on créé de instances de capteurs et systèmes d'alerte, abonnez les systèmes d'alerte aux cateurs, et simulez la détection d'événements.

## Avantages

- **Notification automatique :** Les systèmes d'alerte sont automatiquement notifiés des événements détectés par les capteurs.
- **Couplage faible :** Les capteurs et les systèmes d'alerte sont faiblement couplés, ce qui facilite les modifications futures.
- **Extensibilité :** Vous pouvez facilement ajouter ou supprimer des systèmes d'aalerte sans modifier les capteurs.

## Conclusion

Le design pattern Observer est un outil puissant pour créer des systèmes où les objets doivent être notifiés des changement d'état d'autres objets. Cela permet de maintenir un couplage faible et une grande flexibilité dans la conception du système.