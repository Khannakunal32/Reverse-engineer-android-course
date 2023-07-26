cmake_minimum_required(VERSION 3.8)

add_subdirectory(whale)

set(CMAKE_CXX_STANDARD 17)

set(LINKER_FLAGS "-ffixed-x18 -Wl,--hash-style=both")
set(C_FLAGS "-Werror=format -fdata-sections -ffunction-sections -std=c18")
set(CXX_FLAGS "${CXX_FLAGS} -std=c++20")

if (NOT CMAKE_BUILD_TYPE STREQUAL "Debug")
    set(C_FLAGS "${C_FLAGS} -O0 -fvisibility=hidden -fvisibility-inlines-hidden")
    set(LINKER_FLAGS "${LINKER_FLAGS} -Wl,-exclude-libs,ALL -Wl,--gc-sections -Wl,--strip-all")
else ()
    set(C_FLAGS "${C_FLAGS} -O0")
endif ()

set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} ${C_FLAGS}")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} ${C_FLAGS} ${CXX_FLAGS}")

set(CMAKE_SHARED_LINKER_FLAGS "${CMAKE_SHARED_LINKER_FLAGS} ${LINKER_FLAGS}")
set(CMAKE_MODULE_LINKER_FLAGS "${CMAKE_MODULE_LINKER_FLAGS} ${LINKER_FLAGS}")

include_directories(
        imgui
        imgui/backends
)

include_directories(include
        ${ANDROID_NDK}/sources/android/native_app_glue)

add_library(native_app_glue STATIC ${ANDROID_NDK}/sources/android/native_app_glue/android_native_app_glue.c)

add_library(curl STATIC IMPORTED)
set_property(TARGET curl PROPERTY IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/curl/curl-android-${CMAKE_ANDROID_ARCH_ABI}/lib/libcurl.a)

add_library(ssl STATIC IMPORTED)
set_property(TARGET ssl PROPERTY IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/curl/openssl-android-${CMAKE_ANDROID_ARCH_ABI}/lib/libssl.a)

add_library(crypto STATIC IMPORTED)
set_property(TARGET crypto PROPERTY IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/curl/openssl-android-${CMAKE_ANDROID_ARCH_ABI}/lib/libcrypto.a)

include_directories(curl/curl-android-${CMAKE_ANDROID_ARCH_ABI}/include)
include_directories(curl/openssl-android-${CMAKE_ANDROID_ARCH_ABI}/include)
include_directories(whale/include)

add_library(native-lib SHARED main.cpp
        fake_dlfcn.cpp
        tools.cpp
        ElfImg.cpp
        plthook_elf.cpp
        base64/base64.cpp
        SDK/BGMI_Basic.cpp
        SDK/BGMI_Basic_functions.cpp
        SDK/BGMI_CoreUObject_functions.cpp
        SDK/BGMI_Engine_functions.cpp
        SDK/BGMI_ShadowTrackerExtra_functions.cpp
        SDK/BGMI_Client_functions.cpp
        imgui/imgui.cpp
        imgui/imgui_demo.cpp
        imgui/imgui_draw.cpp
        imgui/imgui_tables.cpp
        imgui/imgui_widgets.cpp
        imgui/backends/imgui_impl_android.cpp
        imgui/backends/imgui_impl_opengl3.cpp)

target_link_libraries(native-lib log android z whale EGL GLESv1_CM GLESv2 GLESv3 native_app_glue curl ssl crypto)