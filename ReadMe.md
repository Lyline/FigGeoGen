#FigGeoGen

L'énoncé de cette application est tiré du livre d'Anne Tasso *Le livre de Java - Premier langage* (13e éditions).

##Brief

   - Affiche des formes géométriques à partir d'un fichier .TXT
   - Propose à l'utilisateur deux boutons interactifs placés en bas de la fenêtre
   - Cas 1 : Lorsque l'utilisateur clique sur "À gauche / Scène", les figures se déplacent sur le bord gauche de la fenêtre
   - Cas 2 : Lorsque l'utilisateur clique sur "À gauche / Formes", les figures s'alignent à gauche de la figure la plus à gauche de la scène

##Détails

Le point de référence des figures se situe en haut à gauche pour le **cercle** (à l'intersection de la tangente verticale gauche et la tangente horizontale supérieure) et le **rectangle** (angle supérieur gauche). Ce point se situe pour le **triangle** sur le sommet le plus haut de la figure.

Les points de référence seront définis dans la classe Forme.