0.5.8
- Fixed a crash when trying to open a corrupt rocket's GUI. (crashing does not help the case)
- Added config option to set the default power state of newly created multiblock machines. (saved states remain unchanged)

0.5.7
- Fixed MODULARFULLSCREEN using raw framebuffer dimensions instead of
  Minecraft scaled GUI dimensions. This corrects GUI scaling for fullscreen view
- Use with AR 2.2.12 for correct fullscreen map behavior

0.5.6
  - Updated chinese (thanks ZY)
  - Fix duplication issue when using Random Things Magnetic enchant 

0.5.5
  - Holo-Projector: 
    - Clear ghostblocks when opening GUI
    - Tooltip overhaul

0.5.4
  - 3D spinning render in rocket/observatory GUI, now renders behind held item
  - Corrected limited slots for Satellite Builder

0.5.3
  - disable MouseTweaksWheelTweak for planetselector fullscreen to repair zoom-in / zoom-out

0.5.2
  - disable MouseTweaksWheelTweak globally to repair normal scrolling
  - Holo-Projector:
    - Show and tell the player's selection
    - Searchbar
  - Cleaned up hardcoded english to langfile entries
    - updated Chinese langfile

0.5.1
  - 3D render of blocks Observatory and Rocket, now renders Vanilla Chests and more correctly
  - GLstate leaking in RocketGUI breaking normal render in inventory
  - Multiblocks-placeholder-blocks pointing to correct block (fixes textureglitch in TOP)