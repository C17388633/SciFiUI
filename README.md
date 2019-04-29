# SciFi UI Project

Name: Killian Pogue

Student Number: C17388633

# Description of the assignment
The objective of this assignment was to make a
UI that had a Science Fiction setting. I decided
to base my UI off being in a cockpit of a mech
aka a pilotable giant robot.

The view that the user has is from inside the mech.
The user has to prevent the mech from losing HP
from the enemies as they try to get to the edge
of the screen.

The user does this by using one of the 3 available
weapons to shoot the enemy.

There is also a radar to show a smaller view of where
the enemies are and also a Status Diplay to show the
user how much HP the mech has left.

# Instructions
The main controls for the assignment are:

- The mouse

For aiming the reticle and when the user clicks the
mouse it will shoot a laser towards the center of the
reticle to shoot the enemy.

It is also used to click on buttons which are
located at the bottom of the screen to select a weapon.
The weapon determines where the laser will come from and
 then join to where the mouse is pointing to at that current moment

- The 'a' key

While the user holds down the A key they are able to
see the status of the mech. 
 

# How it works
This assignment works through an abstract class called
'mechobject' which has two functions called render and update.

There will also be a class called 'UI' which will inherit from
the PApplet class and will be able to do all of the PApplet
methods.

Except the button class, the other classes in this assignment will
be sub classes of the mechobject class. When a subclass has been created
it will be added to an Array List called 'mechObjects'. This allows the 
assignment to use polymorphism to aallow each object in the class to
render on screen for the user to see.

# What I am most proud of in the assignment
The things that I'm most proud of in my assignment are:

1. Being able to acheive something which i have been dreaming to do
which is create a UI for a pilot of a mech or someone in a power suit.
1. That I reduced the amount of times I have 'hard coded' on my assignment
compared to previous OOP labs and other projects. This help me realise that
not all devices have the same screen size and that is something which I
will need to consider more often as I go through this course. 
1. 

# Youtube Video.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

