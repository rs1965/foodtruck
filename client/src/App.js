import React, { useState, useEffect } from 'react';

function App() {
  const [data, setData] = useState(null);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState(null);

  useEffect(() => {
    fetchData();
  }, []);

  const fetchData = async () => {
    try {
      const response = await fetch('http://localhost:8082/foodtrucks'); // Replace with your API endpoint
      if (response.ok) {
        const data = await response.json();
        setData(data);
      } else {
        setError('Error fetching data');
      }
    } catch (error) {
      setError('Error fetching data');
    } finally {
      setIsLoading(false);
    }
  };

  if (isLoading) {
    return <div>Loading...</div>;
  }

  if (error) {
    return <div>Error: {error}</div>;
  }

  return (
      <div>
        {data && (
            <ul>
              {data.map((item) => (
                  <b>item.id</b>
              ))}
            </ul>
        )}
      </div>
  );
}

export default App;
