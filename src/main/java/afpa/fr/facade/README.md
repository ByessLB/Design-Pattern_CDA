# Design Pattern : Façade

## Qu'est-ce que la Façade ?
Le design pattern Façade est utilisé pour fournir une interface simplifiée à un ensemble complexe de sous-système. Il cache la complexité des sous-systèmes et fournit une interface unifée pour les clients.

## Pourquoi utiliser la Façade ?

### Simplification :
- Réduit la complexité pour le client en fournissant une interface simple.

### Maintenabilité :
- Facilite la maintenance du code en isolant les changements dans les sous-systèmes.


### Réutilisabilité :
- Permet de réutiliser les sous-systèmes existants sans modifier le code client.

## Comment ça marche ?

Se référer à l'exercice opéré.

### Explication du code

1. **Sous-systèmes :**
- `AudioPlayer`: charge et joue une piste.
- `Amplifier`: allume l'amplificateur et règle le volume.
- `Speaker`: connecte les haut-parleurs et sort le son.

2. **Façade `JukeboxFacade`:**
- Contient des instances des sous-systèmes `AudioPlayer`, `Amplifier`et `Speaker`.
- Fournit une méthode `playMusic`qui simplifie l'interaction avec les sous-systèmes.

3. **Utilisation :**
- Dans la classe `Main`, on créé une instance de `JukeboxFacade` la méthode `playMusic`pour jouer une piste.

## Avantages

- **Simplification :** La façade fournit une interface simple pour jouer de la musique, cachant la complexité des sous-systèmes.
- **Maintenabilité :** Les changements dans les sous-systèmes n'affectent pas le code client, car il interagit uniquement avec la façade.
- **Réutilisabilité :** Les sous-systèmes peuvent être dans d'autres contextes sans modifier le code client.

## Conclusion

Le design pattern Façade est un outil puissant pour simplifier l'interaction avec des sous-systèmes complexes. Il est particulièrement utile lorsque vous avez besoin de fournir une interface simple pour un système complexe, cachant ainsi la complexité des sous-systèmes.