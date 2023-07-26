
# Mod Menu for Game 


## Disclaimer

This mod menu is created for educational  use only. The developers of this mod menu are not responsible for any negative consequences resulting from the use of this software. Use at your own risk.

## Overview
This repository contains the only a sample code or partial code for a mod menu designed for enhancing the gameplay experience of the game. The mod menu is implemented using reverse engineering techniques and utilizes Lua scripting to introduce new features and functionalities to the game.
C++ and java files are shared

![Mod menu](https://drive.google.com/uc?export=view&id=1CFWWhzDVW1hxszRca6_ux5u_-8sPPkba)
![Mod menu](https://drive.google.com/uc?export=view&id=1_YzxYsRu0f1ryNH0VN_Lx0yAUVd3MmHO)
![Mod menu](https://drive.google.com/uc?export=view&id=11Dh0dJ2ZkLHj1lAngaXZgRrOeOmA2gHU)

## Features

- Easy-to-use in-game mod menu for enabling/disabling various hacks and modifications.
- Customizable Lua scripts to enhance gameplay, introduce cheats, and add new elements to the game.
- 64 bit application use
- Works on both rooted and non-rooted devices (emulators and physical devices).
- Optimized and lightweight code to minimize performance impact.

## Requirements for PC

- Android Studio with NDK and SDK installed.
- Jadx 
- Android emulator
- Frida for dynamic testing
- Basic knowledge of reverse engineering, modding, and game development.

## Requirements for Android

- AIDE 
- MT manager
- Hex decoder

## How it was done

1. Downloaded the cpp for Esp and bypass
2. Open the project in Android Studio.
3. Navigate to the `jni` folder and locate the Lua script files (`mod_menu.lua` and other scripts).
4. Customize the Lua scripts to add or modify features according to your preference.
5. Build the project to generate the APK file.

## Integrating Mod Menu into the Game

1. Locate the `lib` and `dex` files generated after compiling the project. These files are usually found in the `build` or `bin` directory.
2. Extract the `lib` and `dex` files.

### For APK Signing and Installation:

1. Open a terminal and navigate to the directory containing the extracted `lib` and `dex` files.
2. Use `apktool` to decompile the game's APK:

```
apktool d path/to/game.apk
```
3. Copy the extracted `lib` and `dex` files from the mod menu project into the corresponding folders in the decompiled game APK.
4. Rebuild the game's APK with the mod menu files:
```
apktool b path/to/decompiled_game_folder -o modded_game.apk
```
5. Sign the modded APK using `jarsigner` or any APK signing tool of your choice:
```
jarsigner -verbose -keystore your_keystore.keystore modded_game.apk alias_name
```
6. Install the signed APK on your Android device, and the mod menu should now be accessible in the game.

**Note:** Modding and using cheats in games may violate the game's terms of service and can lead to penalties or bans.




