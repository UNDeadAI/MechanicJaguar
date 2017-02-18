cmake_minimum_required(VERSION 3.6)
project(ComputerVision)

set(CMAKE_CXX_STANDARD 11)

find_package(OpenCV REQUIRED)
include_directories(${OpenCV_INCLUDE_DIRS})

set(SOURCE_FILES LearningOpenCV/chap1/connectToCamera.cpp LearningOpenCV/chap1/openVideo.h LearningOpenCV/chap1/openVideo.cpp)
#set(SOURCE_FILES LearningOpenCV/chap1/openImage.cpp)
add_executable(ComputerVision ${SOURCE_FILES})

target_link_libraries(ComputerVision ${OpenCV_LIBS})

#rtsp://192.168.0.168:8555/PSIA/Streaming/channels/0?videoCodecType=MJPEG /home/juan/Videos/Thunder.mp4 /home/juan/Pictures/DarkSouls.jpg