let allGoods = [];

async function init(){
  let link = "https://legendary-disco-g4r45r5vqxj4f97wx-8500.app.github.dev";
  let response = await fetch(link + "/goods");
  allGoods = await response.json();
  displaySaleItems();
}

function getRandomItems(array, count){
  let result = [];
  let indexes = [];
  
  while(indexes.length < count && indexes.length < array.length){
    let randomIndex = Math.floor(Math.random() * array.length);
    if(indexes.indexOf(randomIndex) === -1){
      indexes.push(randomIndex);
      result.push(array[randomIndex]);
    }
  }
  return result;
}

function displaySaleItems(){
  let randomProducts = getRandomItems(allGoods, 3);
  let html = "<h2 style='text-align: center; margin-bottom: 20px; width: 100%;'>On Sale Today</h2>";
  
  for(let i = 0; i < randomProducts.length; i++){
    let item = randomProducts[i];
    let img = item["Image ID"] || "https://via.placeholder.com/200?text=No+Image";
    html += "<div class='card'>";
    html += "<div class='cardImage'><img src='" + img + "' alt='" + item.Name + "'></div>";
    html += "<div class='cardContent'>";
    html += "<h3 class='cardTitle'>" + item.Name + "</h3>";
    html += "<p class='cardInfo'><strong>Sale Item</strong></p>";
    html += "<p class='cardInfo'>Expires: " + item.ExpirationDate + "</p>";
    html += "</div></div>";
  }
  
  document.getElementById("mainpanel").innerHTML = html;
}
