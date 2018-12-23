# soarers-converter-configs
Soarer's converter configs for my IBM Model M keyboard

## Description

This repo contains configs for the Soarer's Converter, which converts old PS2
and AT keyboard connectors to USB. Soarer's Converter allows remapping keys and
creating layers and macros.

See [this geekhack thread](https://geekhack.org/index.php?topic=17458.0) for
details on Soarer's Converter and to find binaries for flashing it.

## Writing the config to the converter

1. Get the Soarer's Converter binaries from [here](https://geekhack.org/index.php?topic=17458.0).
1. Unzip them somewhere and add the tools directory to your PATH.
1. Create a binary config from the config:
`$ scas ibm-model-m-mac.sc ibm-model-m-mac.scb`
1. Write the binary config to the converter:
`$ scwr ibm-model-m-mac.scb`

## ibm-model-m-mac.sc

This config is what I use on my Soarer's converter to make my IBM Model M
usable with a Mac. Model Ms have only 2 key rollover so some of the three key
combinations don't work. For example, alt+cmd+left/right to switch between
browser tabs isn't possible on the Model M. This config fixes that with a number
of macros that make lshift+lalt+left/right have the same effect.

There are no Command (windows) keys on the Model M. This config remaps the left
Alt key to Command (LGUI).

The Capslock key is remapped as a function key, which activates a second layer
with HJKL mapped to an arrow cluster, F1 and F2 mapped to increase/decrease
display brightness, and F3, F4 and F5 mapped to mute/volume up/volume down.

