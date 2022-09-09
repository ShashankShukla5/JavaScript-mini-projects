const videoElement = document.getElementById("video");
const button = document.getElementById("button");

// prompt to select media stream, pass to video stream and then play
async function selectMediaStream() {
  try {
    const mediaStream = await navigator.mediaDevices.getDisplayMedia();
    videoElement.srcObject = mediaStream;
    videoElement.onloadedmetadata = () => {
      videoElement.play();
    };
  } catch (error) {
    // catch error here
    console.log("whoops, error here: ", error);
  }
}

button.addEventListener("click", async () => {
  // disable button
  button.disabled = false;
  // start picture in picture
  await videoElement.requestPictureInPicture();
  // reset button
  button.disabled = true;
});

// on load
selectMediaStream();
