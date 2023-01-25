<!DOCTYPE html>
<html>
<img src="worldMap.jpg" alt="Map of the World" width="1000" height="1000">
<head>
 
</head>
<div id="world-map">
  <img src="world-map.jpg" alt="World Map">
  <div class="region" id="Latin-American" data-tooltip="Region 1"></div>
  <div class="region" id="South-Asian" data-tooltip="Region 2"></div>
  <div class="region" id="East/Southeast-Asian" data-tooltip="Region 3"></div>
  <div class="region" id="Middle-Eastern/North-African" data-tooltip="Region 4"></div>
  <div class="region" id="Central Asian" data-tooltip="Region 5"></div>
  <div class="region" id="European" data-tooltip="Region 6"></div>
  <div class="region" id="Native-American/Siberian" data-tooltip="Region 7"></div>
  <div class="region" id="Sub-Saharan-African" data-tooltip="Region 8"></div>
  <div class="region" id="Polynesia/Oceania" data-tooltip="Region 9"></div>
  <div class="region" id="North-American" data-tooltip="Region 10"></div>
</div>
<style>
  #world-map {
  position: relative;
  }
  #world-map img {
    width: 100%;
  }
  .region {
    position: absolute;
    width: 50px;
    height: 50px;
    /* add other styles as needed */
  }
  #region-1 {
    top: 20px;
    left: 30px;
    /* add other styles as needed */
  }
  #region-2 {
    top: 100px;
    left: 150px;
    /* add other styles as needed */
  }
</style>
<body>
  <div id="map" style="height: 300px;"></div>
  <script>
  </script>
</body>
</html>

