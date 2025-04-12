# Final Project - Pouria Alaeinezhad

# System Command Executor via MQTT

This repository contains Pouria's final project for the CU ECEN Embedded Linux course.

---

##  Project Documentation

- 📘 [Project Overview (Wiki)](https://github.com/cu-ecen-aeld/final-project-Pooria4484/wiki/Project-Overview)  
- 📅 [Schedule and Sprint Planning](https://github.com/cu-ecen-aeld/final-project-Pooria4484/wiki/Schedule)  
- 📋 [GitHub Project Board](https://github.com/users/Pooria4484/projects/2)

---

##  Summary

This project allows remote system command execution on Raspberry Pi 3 using MQTT.  
It uses a Linux char driver (`/dev/syscmd`) and a Python MQTT client to receive, process, and control commands securely.

Build system: **Yocto**  
Target platform: **Raspberry Pi 3**

## 🔧 Build Instructions

### 1. Clone the Repository and Submodules

```bash
git clone --recurse-submodules https://github.com/cu-ecen-aeld/final-project-Pooria4484.git
cd final-project-Pooria4484
```

If you forgot to use --recurse-submodules, run:

```bash
git submodule update --init --recursive
```

2. Setup the Build Directory

```bash
cd yocto
cp -r build-config build-rpi
cp build-config/*.conf build-rpi/conf/

```

3. Source the Yocto Environment

```bash
cd poky
source oe-init-build-env ../build-rpi

```

4. Build the Image

```bash
bitbake core-image-base

```

⚠️ This can take several hours the first time.
It is highly recommended to configure DL_DIR and SSTATE_DIR to reuse previously cached downloads and shared state.

Enjoy building your Embedded Linux system! 🚀
