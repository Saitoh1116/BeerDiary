import BeerCard from "./components/BeerCard"

const dummyBeers = [
  {
    id: 1,
    name: "WHITE LINES",
    brewery: "美深白樺ブルワリー",
    rating: 4.5,
    imageUrl: "https://images.unsplash.com/photo-1608270586620-248524c67de9",
    comment: "爽やかで飲みやすい！また飲みたい。"
  },
  {
    id: 2,
    name: "Wild Sheep Chase",
    brewery: "美深白樺ブルワリー",
    rating: 4.2,
    imageUrl: "https://images.unsplash.com/photo-1584225064785-c62a8b43d148",
    comment: "苦味と香りのバランスが最高。"
  }
]

function App() {
  return (
    <div style={{ padding: "24px" }}>
      <h1>🍺 Beer Diary</h1>
      {dummyBeers.map((beer) => (
        <BeerCard key={beer.id} beer={beer} />
      ))}
    </div>
  )
}

export default App
