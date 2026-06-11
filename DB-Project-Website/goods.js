let goods = [];

async function init(){
  let link = "https://legendary-disco-g4r45r5vqxj4f97wx-8500.app.github.dev";
  let response = await fetch(link + "/goods");
  goods = await response.json();
  generateCards(goods);
}

function generateCards(items){
  let html = "";
  for(let i = 0; i < items.length; i++){
    let item = items[i];
    let img = item["Image ID"] || "https://via.placeholder.com/200?text=No+Image";
    html += "<div class='card'>";
    html += "<div class='cardImage'><img src='" + img + "' alt='" + item.Name + "'></div>";
    html += "<div class='cardContent'>";
    html += "<h3 class='cardTitle'>" + item.Name + "</h3>";
    html += "<p class='cardInfo'><strong>Exp:</strong> " + item.ExpirationDate + "</p>";
    html += "</div></div>";
  }
  
  if(items.length === 0) {
    html = "<p style='text-align: center; padding: 20px; width: 100%;'>No products found</p>";
  }
  
  document.getElementById("mainpanel").innerHTML = html;
}

function filter(){
  let searchTerm = document.getElementById("customername").value.toLowerCase();
  let results = [];
  
  for(let i = 0; i < goods.length; i++){
    if(goods[i].Name.toLowerCase().includes(searchTerm)) {
      results.push(goods[i]);
    }
  }
  generateCards(results);
}