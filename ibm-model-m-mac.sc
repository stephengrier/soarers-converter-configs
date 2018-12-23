layerblock
  FN1 1
endblock

# Base layer remaps
remapblock
  layer 0
    CAPS_LOCK FN1            # Make caps lock a function key
    LALT      LGUI           # Make left alt a Cmd (Win) key
    PAUSE     SYSTEM_POWER   # Top right corner power key
endblock

# Layer 1 mappings
remapblock
  layer 1
    H LEFT
    J DOWN
    K UP
    L RIGHT
    F1 F14               # Decrease Display Brightness 
    F2 F15               # Increase Display Brightness
    F3 MEDIA_MUTE         # Volume controls
    F4 MEDIA_VOLUME_DOWN
    F5 MEDIA_VOLUME_UP
endblock

macroblock

# LSHIFT + LGUI + LEFT = LALT + LGUI + LEFT
macro LEFT LGUI LSHIFT
  push_meta set_meta LALT
  push_meta clear_meta LSHIFT
  press LEFT
  pop_meta
  pop_meta
endmacro

# LSHIFT + LGUI + RIGHT = LALT + LGUI + RIGHT
macro RIGHT LGUI LSHIFT
  push_meta set_meta LALT
  push_meta clear_meta LSHIFT
  press RIGHT
  pop_meta
  pop_meta
endmacro

endblock
